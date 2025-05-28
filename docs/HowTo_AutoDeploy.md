# 🔄 Auto Deployment – How It Works

This project uses **GitHub Actions** to automatically build and deploy the latest version of the XMLUtils installer to a Windows Server via SCP.

## 🧩 Overview

Whenever code is **pushed to `master`**, the following happens:

1. ✅ GitHub Actions triggers the `build-and-deploy.yml` workflow
2. 🏗 The project is built via Maven
3. 📦 An `.exe` installer is created with `jpackage`
4. ☁️ The installer is uploaded as a GitHub artifact
5. 🚀 The artifact is then **SCP'd to your Windows Server**, into:
   ```
   C:/inetpub/wwwroot/downloads/
   ```
6. 🔗 The latest installer is available at:
   ```
   http://<your-server-ip>/downloads/XMLUtils-1.0.exe
   ```

---

## 📁 Workflow File

Located at:
```
.github/workflows/build-and-deploy.yml
```

Key steps:
- `runs-on: windows-latest` to build `.exe` with jpackage
- Uses `actions/upload-artifact@v4` / `download-artifact@v4`
- Uses `appleboy/scp-action@master` to upload to the server

---

## 🔐 Required Secrets

These secrets must be configured in your GitHub repository under **Settings > Secrets and variables > Actions**:

| Name                | Description                      |
|---------------------|----------------------------------|
| `WIN_SERVER_HOST`   | Public IP or domain of the server |
| `WIN_SERVER_USER`   | Windows Server username (e.g. `Administrator`) |
| `WIN_SERVER_PASS`   | Password for the above user      |

---

## 🧪 Debugging Tips

- Add `ls -R` or `ls -lR` steps to inspect paths
- Use `debug: true` in the SCP step
- Verify `dist/` folder contains `XMLUtils-1.0.exe`

---

## ✅ Final Notes

- This setup ensures that **every push to master results in a downloadable installer**
- You can rename or version the `.exe` file using `--name` or `github.run_number`
- You can also deploy only on tags/releases instead of every push if needed
