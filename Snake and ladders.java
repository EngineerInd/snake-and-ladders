bc,dr,d=input().split(","),input().split(","),{}
pos=int(dr[0])
for c in bc:
  r=c.split(":")
  d[int(r[0])]=int(r[1])
for a in range(len(dr)):
  if pos in list(d.keys()) :
    pos=d[pos]
  try:
    pos=pos+int(dr[a+1])
  except:
    pass
if pos>100 or pos==100:
  print("Yes",end="")
else:
  print("No",end="")
