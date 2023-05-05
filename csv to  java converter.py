import pandas as pd
import re

def split(times, data):
    val = []
    if times == 1:
        pattern = "(\d+)"
        match = re.search(pattern,data)
        val = [match.group(0)]
    else:
        pattern = "(\d+),(\d+)"
        match = re.search(pattern,data)
        val = [match.group(1),match.group(2)]
    return val

def get(colName, varName, dataType):
    parameters = ""
    if("varchar" in dataType.lower()):
        sizes = split(1,dataType)
        dataType = "String"
        parameters = f'name = "{colName}", length = {sizes[0]}'
    elif "integer" in dataType.lower():
        dataType = "Long"
        parameters = f'name = "{colName}"'
    elif "char" in dataType.lower():
        sizes = split(1,dataType)
        dataType = "String"
        parameters = f'name = "{colName}")\n@Size(min = {sizes[0]}, max = {sizes[0]}'
    elif "date" in dataType.lower():
        dataType = "Date"
        parameters = f'name = "{colName}"'
    elif "decimal" in dataType.lower():
        sizes = split(2,dataType)
        dataType = "Double"
        parameters = f'name = "{colName}", precision = {sizes[0]}, scale = {sizes[1]}'
    code = f"@Column({parameters})\nprivate {dataType} {varName};"
    return code


def create(colName, varName, dataType, output):
    print(colName, varName, dataType)
    colName = colName.replace(" ","_")
    varName = varName.replace(" ","_")
    code = get(colName, varName, dataType)
    print(code,end="\n\n")

    output.append(code)

df = pd.read_csv('data.csv')
df = df[df['Name'] == 'STUDENT DETAILS']

output = []
for i in df.index:
    create(df['Attribute/Column Physical_Name'][i], df['Attribute/Column Name'][i], df['Physical Data Type'][i], output)


code = "\n\n".join(output)
file = open('code.txt','w+')
file.write(code)
file.close()


# print(df.to_string()) 