@echo off
chcp 65001
REM 切换到你的项目目录
cd D:\VScode_20230829\algoritmsInVscode

REM 添加所有改动到暂存区
git add .

REM 提交改动
git commit -m "blueBridge 13 B java wordAnalyze "

REM 推送改动到远程仓库
git push origin master