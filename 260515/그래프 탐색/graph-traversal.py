import sys
sys.setrecursionlimit(10**6)

n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]

visited = [False] * (n + 1)

v_cnt = 0


def dfs(v):
    global v_cnt

    for cur in graph[v]:

        if visited[cur]:
            continue

        visited[cur] = True
        v_cnt += 1

        dfs(cur)


for _ in range(m):
    v1, v2 = map(int, input().split())

    graph[v1].append(v2)
    graph[v2].append(v1)


visited[1] = True

dfs(1)

print(v_cnt)