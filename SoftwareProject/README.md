A quick guide on adding things to this repository,
this is how it's done on linux, it should be the same in windows.

 - Navigate to the SoftwareProject folder (you want to be just inside it) using the command prompt
 
 - type
    git add *name of file that you changed*
You can do this as many times as you like, adding little bits on. This marks the files to be updated on your machine but doesn't make them public.

 - When you want to make a piece of work available for the rest of us to see, type in
    git commit -m "*a small note to tell us what you did, eg debugged section 4*"
This ties all of your 'git add' sections together and gives them a label but they still aren't available for the rest of us.

 - Finally, to add the changes to the central repository, type
    git push
Now we can see your changes, but be on your guard. If we don't like them, we may have to kill you.

Also, you may have noticed the guide doesn't tell you how to get the initial folder from github. I've never done that bit, so I'll just hope that the website talks you through it, though if you're reading this, you may already have worked around that.
