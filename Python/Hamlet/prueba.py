filein=open("hamlet.txt","r")
texto=filein.readlines()
palabras=[]
palabras.append(('hallo',0))

for i in texto:
    x=i.split()
    
    for j in x:
        pal=j
        encontrado=False
        for pa in palabras:
            if pa[0]==pal:
                pa[1]+=1
                encontrado=True
        if encontrado==False:
            palabras.append((pal,1))

                
            
                
print palabras

