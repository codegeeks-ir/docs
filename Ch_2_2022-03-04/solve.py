file = open("users.txt",'w')
file.close()

output,c = [],0
inputs = input().split(' ')
while inputs[0] != '':

    if inputs[0] == 'Add':
        file,line = open('users.txt','a')," "
        file.write(line.join(inputs[1:]) + '\n')
        file.close()
        output.append("User " + inputs[4] + ' added successfully') # output
        #sort user file
        file = open('users.txt','r')
        lines = file.readlines()
        lines.sort()
        file_w = open('users.txt','w')
        file_w.write(''.join(lines))
        file_w.close(),file.close()

    if inputs[0] == 'Find':
        line,f,c,found = " ",False,c+1,0
        file = open('users.txt','r')
        for l in file:
            user = list(l.split())
            if inputs[1] == user[3][:len(inputs[1])]:
                # user found
                if found < 10:
                    output.append(str(c) + ' ' + line.join(user)) # output
                    f = True
                found += 1 # found but not added
        if f == False:
            output.append(str(c) + ' No user found') # output
        file.close()
    inputs = input().split(' ')

for out_line in output:
    print(out_line)