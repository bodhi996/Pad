Here's the complete step-by-step to run it on another device.

On the OLD device — prepare the folder
Step 1. Make sure the job-app folder contains these (it should already):

package.json and package-lock.json
jobs-live.json
apply/ folder (with config.json and resume.pdf inside)
app/, components/, lib/, scripts/
your .env / .env.local file(s)
not node_modules/ (you deleted it — good) and not .next/
Step 2. Copy that job-app folder to the new device (USB drive, OneDrive, zip + email, etc.).

On the NEW device — one-time setup
Step 3. Install Node.js (LTS version): go to nodejs.org, download, install, click through defaults.

Step 4. Install Google Chrome (the agent drives real Chrome): google.com/chrome.

Step 5. Open a terminal inside the job-app folder:

Windows: open the job-app folder in File Explorer → click the address bar, type cmd, press Enter.
Mac: right-click the folder → "New Terminal at Folder".
Step 6. Install the dependencies (rebuilds node_modules):

npm install
Wait ~1–2 minutes until it finishes.

Step 7. (Mac/Linux only — skip on Windows) Point the agent at your Chrome. Open apply/agent.js, find the line with CHROME_PATH (~line 234), and change it to:

Mac: /Applications/Google Chrome.app/Contents/MacOS/Google Chrome
Do the same for CHROME in scripts/ingest-ats.mjs.
(On another Windows PC with Chrome installed normally, no change needed.)
Run it
Step 8. Start the web app (the job board):

npm run dev
Then open http://localhost:3001 in your browser. You'll see the board with all the filters.

Step 9. Use the apply agent. In the browser, click Select & Apply, pick jobs, hit Queue → Apply. Then, in a second terminal in the same folder:

node apply/agent.js --from-queue
Or run a single form / job directly:

node apply/agent.js --form "https://airtable.com/…/form"
node apply/agent.js --job gh_5275765008
Quick troubleshooting
'npm' is not recognized → Node.js didn't install correctly, or you need to close and reopen the terminal after installing it.
Agent opens no window / "Chrome not found" → Chrome isn't installed, or (Mac/Linux) you skipped Step 7.
Board shows 0 jobs → make sure jobs-live.json sits in the job-app folder root.
Login/settings pages error → those need the Supabase keys from your .env.local; browsing + applying work without them.
That's the whole flow: copy folder → install Node + Chrome → npm install → npm run dev → node apply/agent.js.

The only cross-OS gotcha is the Chrome path (Step 7). Want me to make that auto-detect the OS so you can skip Step 7 entirely on any machine? It's a 5-minute change and makes the folder truly plug-and-play.
