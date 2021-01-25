# 复制 README.md
# cp README.md docs/README.md

#sh init.sh

# 更新 main
git add .

read -p "输入备注：🎨 " message
if [ -z $message ]
then
  message="规范"
fi

git commit -m "🎨 $message"
git push -f https://github.com/ylksty/spring-hub.git main

echo "🎨 $message"