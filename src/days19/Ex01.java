package days19;

/**
 * @author scm
 * @date 2026. 6. 8. 오전 11:22:08
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			git 실습을 위한 기본 url 
			
			https://github.com/gmake20/javaPro.git
			
			
			…or create a new repository on the command line
			echo "# javaPro" >> README.md
			git init
			git add README.md
			git commit -m "first commit"
			git branch -M main
			git remote add origin https://github.com/gmake20/javaPro.git
			git push -u origin main
			
			
			…or push an existing repository from the command line
			git remote add origin https://github.com/gmake20/javaPro.git
			git branch -M main
			git push -u origin main
			
			
			git remote -v
			git status
							
				===============  VS Code ==================================			
				$ git status
				On branch main
				
				No commits yet
				
				Untracked files:
				  (use "git add <file>..." to include in what will be committed)
				        Hello.java
				
				nothing added to commit but untracked files present (use "git add" to track)
				===============================================================			
			
			git add .
				
			git status
				
				===============  VS Code ==================================	
				On branch main
				
				No commits yet
				
				Changes to be committed:
				  (use "git rm --cached <file>..." to unstage)
				        new file:   Hello.java
				
				
				Tkddyd@DESKTOP-J0I6PHG MINGW64 /c/Class/GitClass/GitTest/SiSt-Workspace/JavaClass (main)
				===============================================================	
			
			git commit -m "Hello.java first Commit"
			
				===============  VS Code ==================================				
				[main (root-commit) eca60f1] Hello.java first Commit
				 1 file changed, 6 insertions(+)
				 create mode 100644 Hello.java
				 ===============================================================
 			
 			git status

				===============  VS Code ================================== 	
				On branch main
				nothing to commit, working tree clean		
				===============================================================
 			
 			git log

				===============  VS Code ================================== 			
				commit eca60f1fca8524ab9af971bc305990f3fd82c0cf (HEAD -> main)
				Author: andy <scym14@gmail.com>
				Date:   Mon Jun 8 11:31:23 2026 +0900
				
				    Hello.java first Commit
				===============================================================

			Hello.java 코드 수정
			
			git status
			
				===============  VS Code ================================== 	
				On branch main
				Changes not staged for commit:
				  (use "git add <file>..." to update what will be committed)
				  (use "git restore <file>..." to discard changes in working directory)
				        modified:   Hello.java
				
				no changes added to commit (use "git add" and/or "git commit -a")		
				===============================================================
			
			git add .
			git status
			
				===============  VS Code ================================== 		
				On branch main
				Changes to be committed:
				  (use "git restore --staged <file>..." to unstage)
				        modified:   Hello.java
					
				===============================================================
 			
				===============  VS Code ================================== 	
				git commit -m "Hello.java Update Commit"
				[main aac67b6] Hello.java Update Commit
				 1 file changed, 1 insertion(+), 1 deletion(-) 			
				===============================================================
 			
				===============  VS Code ================================== 		
				$ git log
				commit aac67b6b0ae1be2db9ed9a0c3a4213a4a61386b7 (HEAD -> main)
				Author: andy <scym14@gmail.com>
				Date:   Mon Jun 8 11:36:15 2026 +0900
				
				    Hello.java Update Commit
				
				commit eca60f1fca8524ab9af971bc305990f3fd82c0cf
				Author: andy <scym14@gmail.com>
				Date:   Mon Jun 8 11:31:23 2026 +0900
				
				    Hello.java first Commit	
				===============================================================
 			
 				// remote 설정확인하기
 				$ git remote -v 

				Tkddyd@DESKTOP-J0I6PHG MINGW64 /c/Class/GitClass/GitTest/SiSt-Workspace/JavaClass (main)
 			
 			
 			원격 저장소 설정하기 
 			
				===============  VS Code ================================== 	
				git remote add origin https://github.com/gmake20/javaPro.git
				
				Tkddyd@DESKTOP-J0I6PHG MINGW64 /c/Class/GitClass/GitTest/SiSt-Workspace/JavaClass (main)
				$ git remote -v 
				origin  https://github.com/gmake20/javaPro.git (fetch)
				origin  https://github.com/gmake20/javaPro.git (push)		
				===============================================================
 			
 			원격 저장소로 push하기 
 			
				===============  VS Code ================================== 
				git push -u origin main
				Enumerating objects: 6, done.
				Counting objects: 100% (6/6), done.
				Delta compression using up to 24 threads
				Compressing objects: 100% (4/4), done.
				Writing objects: 100% (6/6), 551 bytes | 551.00 KiB/s, done.
				Total 6 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
				remote: Resolving deltas: 100% (1/1), done.
				To https://github.com/gmake20/javaPro.git
				 * [new branch]      main -> main
				branch 'main' set up to track 'origin/main'.			
				===============================================================
 			
 			
 			
 			원격저장소를 가져오기 
 			1. git 설치
 			2. 사용자 등록
 			
 			
 			1. Git 로컬 저장소
 			git clone https://github.com/gmake20/javaPro.git
				
				===============  VS Code ================================== 	
				$ git clone https://github.com/gmake20/javaPro.git
				Cloning into 'javaPro'...
				remote: Enumerating objects: 6, done.
				remote: Counting objects: 100% (6/6), done.
				remote: Compressing objects: 100% (3/3), done.
				remote: Total 6 (delta 1), reused 6 (delta 1), pack-reused 0 (from 0)
				Receiving objects: 100% (6/6), done.
				Resolving deltas: 100% (1/1), done.		
				===============================================================
 			
				===============  VS Code ================================== 	
				git add .
				
				Tkddyd@DESKTOP-J0I6PHG MINGW64 /c/Class/GitClass/GitTest/Home-Workspace/JavaClass/javaPro (main)
				$ git commit -m "Home Hello.java Study commit"
				[main 8c558c0] Home Hello.java Study commit
				 1 file changed, 1 insertion(+)
				
				Tkddyd@DESKTOP-J0I6PHG MINGW64 /c/Class/GitClass/GitTest/Home-Workspace/JavaClass/javaPro (main)
				$ git push
				Enumerating objects: 5, done.
				Counting objects: 100% (5/5), done.
				Delta compression using up to 24 threads
				Compressing objects: 100% (2/2), done.
				Writing objects: 100% (3/3), 289 bytes | 289.00 KiB/s, done.
				Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
				remote: Resolving deltas: 100% (1/1), completed with 1 local object.
				To https://github.com/gmake20/javaPro.git
				   aac67b6..8c558c0  main -> main		
				===============================================================
 			
				===============  VS Code ==================================
				git remote -v
				git status
				git branch
				
				git init
				git remote add origin url
				git add .
				git commit "abc"
				git push -u origin main 			
				===============================================================
 			
===============  VS Code ================================== 			
===============================================================
 			
===============  VS Code ================================== 			
===============================================================
 			
===============  VS Code ================================== 			
===============================================================
 			

		 */
		
	}

}
