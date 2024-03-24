import concurrent.futures

import requests


def send_topup_request(key):
    url = 'https://aifree.best/api/user/topup'
    headers = {
        'authority': 'aifree.best',
        'accept': 'application/json, text/plain, */*',
        'accept-language': 'zh-CN,zh;q=0.9,en;q=0.8,en-CN;q=0.7',
        'cache-control': 'no-cache',
        'content-type': 'application/json',
        'cookie': 'session=',
        'origin': 'https://aifree.best',
        'pragma': 'no-cache',
        'referer': 'https://aifree.best/topup',
        'sec-ch-ua-mobile': '?0',
        'sec-ch-ua-platform': '"macOS"',
        'sec-fetch-dest': 'empty',
        'sec-fetch-mode': 'cors',
        'sec-fetch-site': 'same-origin',
    }

    data = {
        'key': key
    }

    response = requests.post(url, headers=headers, json=data)

    return response.text


def read_keys_from_file(filename):
    with open(filename, 'r') as file:
        keys = file.read().splitlines()
    return keys


filename = 'keys.txt'  # 文件中包含每行一个 key
keys = read_keys_from_file(filename)

# 使用 ThreadPoolExecutor 来并发执行请求
with concurrent.futures.ThreadPoolExecutor() as executor:
    # 提交任务并获取结果
    results = executor.map(send_topup_request, keys)

# 打印结果
for result in results:
    print(result)
