#import necessary modules
#import csv
#with open('E:\data.csv','rt')as f:
 # data = csv.reader(f)
  #for row in data:
   #     print(row)
#print("---------------")

#import csv
#reader = csv.DictReader(open("E:/file2.csv"))
#for raw in reader:
#    print(raw)
#print("-------------")



#with open('E:\writeData.csv', mode='w') as file:
 #   writer = csv.writer(file, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)

    #way to write to csv file
  #  writer.writerow(['Programming language', 'Designed by', 'Appeared', 'Extension'])
   # writer.writerow(['Python', 'Guido van Rossum', '1991', '.py'])
   # writer.writerow(['Java', 'James Gosling', '1995', '.java'])
   # writer.writerow(['C++', 'Bjarne Stroustrup', '1985', '.cpp'])

#import necessary modules
#import pandas
#result = pandas.read_csv('E:\data.csv')
#print(result)
#print("-------------")

from pandas import DataFrame
C = {'Programming language': ['Python','Java', 'C++'],
        'Designed by': ['Guido van Rossum', 'James Gosling', 'Bjarne Stroustrup'],
        'Appeared': ['1991', '1995', '1985'],
        'Extension': ['.py', '.java', '.cpp'],
    }
df = DataFrame(C, columns= ['Programming language', 'Designed by', 'Appeared', 'Extension'])
export_csv = df.to_csv (r'E:\pandaresult.csv', index = None, header=True) # here you have to write path, where result file will be stored
print (df)

