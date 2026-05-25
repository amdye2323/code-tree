n = int(input())

# Please write your code here.

visited = [False for _ in range(n+1)]

result = []
def dfs():
    if len(result) == n:
        print(*result, sep= " ")
    

    for i in range(n, 0, -1):
        if visited[i] == True:
            continue
        
        visited[i] = True
        result.append(i)
        dfs()
        result.pop()
        visited[i] = False



dfs()