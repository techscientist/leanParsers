folder_name='json'
msg_file='msg.txt'
files=`ls $folder_name`
messages=`cat $msg_file`

for i in `seq 1 100`
do
file_=${files[$RANDOM % ${#files[@]} ]}
location=$folder_name'/'$file_
python3.5 generator.py $location
message=${messages[$RANDOM % ${#messages[@]} ]}
git add .
git commit -m "$message"
done

git push origin master