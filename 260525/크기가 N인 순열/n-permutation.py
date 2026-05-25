n = int(input())

# Please write your code here.

visited = [False for _ in range(n+1)]

result = []

def dfs():
    if len(result) == n:
        print(*result, sep=" ")
        return

    for i in range(1, n+1):
        if visited[i] == True:
            continue
        visited[i] = True
        result.append(i)
        dfs()
        visited[i] = False
        result.pop()


dfs()

