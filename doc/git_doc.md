## Here are some related git commands when building this app:

#### 1. create a new topic branch for different topic
```
$ git branch branch_feature
$ git checkout branch_feature
```

#### 2. update the edited part from topic branch to master banch
```
$ git checkout branch_feature
$ git add <edited_files>
$ git commit -m "edited message"
$ git checkout master
$ git merge branch_feature
$ git push
```

#### 3. update topic branch from master
```
$ git checkout branch_feature
$ git rebase -i master
```

#### 4. delete the topic branch
```
$ git checkou master
$ git branch -d branch_feature
```

## Here are some git problems/solutions when building this app:

#### Problem1:  Undo a commit, making it a topic branch 
#### Solution: 
```
$ git log
commit 2ea1e4e3ed75a8fec16500b861480133e5284a5e (HEAD -> master, github/master)
Author: Ali Zhao <0604aliz@gmail.com>
Date:   Tue Dec 28 23:00:05 2021 -0500

    Add main activity layout

commit 5b548cb3ec8c53b9ffd050c3c9e58e288f793e00
Author: Ali Zhao <0604aliz@gmail.com>
Date:   Tue Dec 28 22:54:48 2021 -0500

    Initial commit
$ git branch branch_layout
$ git reset --hard 5b548cb3ec8c53b9ffd050c3c9e58e288f793e00
HEAD is now at 5b548cb Initial commit 
```

#### Problem2: 
```
$ git push
To https://github.com/alibabazhao/MockCalculator.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/alibabazhao/MockCalculator.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
```
#### Solution:
```
$ git push -f origin master
Enumerating objects: 25, done.
Counting objects: 100% (25/25), done.
Delta compression using up to 4 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (13/13), 1.96 KiB | 1.96 MiB/s, done.
Total 13 (delta 3), reused 0 (delta 0)
remote: Resolving deltas: 100% (3/3), completed with 3 local objects.
To https://github.com/alibabazhao/MockCalculator.git
 + 2ea1e4e...e029290 master -> master (forced update)
```
