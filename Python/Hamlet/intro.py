filein=open("hamlet.txt","r")
texto=filein.readlines()
palabras=[]
for i in range(len(texto)):
    x=texto[i].split
    for j in range(len(x)):
        pal=x[j]
        for pa in palabras:
            if pa[0]==pal:
                pa[1]+=1
            elif:
                palabras.append((pal,1))
print palabras