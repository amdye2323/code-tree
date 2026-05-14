n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

visited= [[False] * m for _ in range(n)]


dx = [1, 0]
dy = [0, 1]

def inRange(x, y):
    return 0 <= x < n and 0 <= y <m
def dfs(x, y):
    visited[x][y] = True

    nx, ny = 0, 0
    for i in range(2):
        nx = x+ dx[i]
        ny = y+ dy[i]
        if not inRange(nx,ny):
            continue
        if visited[nx][ny]:
            continue
        if(grid[nx][ny] == 0):
            continue
        dfs(nx, ny)


if grid[0][0] == 1:
    dfs(0, 0)

print(int(visited[n-1][m-1]))
    