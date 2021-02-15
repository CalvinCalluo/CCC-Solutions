if __name__ == '__main__':
    L = int(input())
    s = []
    for i in range(L):
        num, char = input().split()
        s.append(char * int(num))
    for word in s:
        print(word)