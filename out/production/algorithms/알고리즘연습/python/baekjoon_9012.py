for i in range(int(input())):
    s = list(input())
    cnt = 0
    for i in s:
        if i == '(':
            cnt += 1
        elif i == ')':
            cnt -= 1
        if cnt < 0:
            print('NO')
            break
    if cnt > 0:
        print('NO')
    elif cnt == 0:
        print('YES')