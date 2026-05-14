n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

answer = 0

# 중심점 선택
for cx in range(n):
    for cy in range(n):

        # K는 0부터 2n 정도까지 보면 충분
        for k in range(2 * n):
            gold_count = 0

            # 전체 격자 검사
            for x in range(n):
                for y in range(n):
                    dist = abs(cx - x) + abs(cy - y)

                    if dist <= k and grid[x][y] == 1:
                        gold_count += 1

            cost = k * k + (k + 1) * (k + 1)

            if gold_count * m >= cost:
                answer = max(answer, gold_count)

print(answer)