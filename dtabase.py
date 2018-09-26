import mysql.connector


def decodetuple(tup):
    return bytearray(tup).decode('utf-8')

mydb=mysql.connector.connect(host="server.solidhost.pl",
user="pp42878_wyp2",passwd="xxxx",database="pp42878_wypozyczalnia2")
print(mydb)
mycursor=mydb.cursor()
mycursor.execute("Select * from aktorzy")
for x in mycursor:
    print("Imię i Nazwisko:"+decodetuple(x[1])+" "+decodetuple(x[2]))
