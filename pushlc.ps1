param (
    [string]$filename
)

if (-not $filename) {
    Write-Host "❌ Please provide a filename. Example: ./pushlc.ps1 0001-two-sum.java"
    exit
}

git add .
git commit -m "Add $filename"
git push

Write-Host "✅ Pushed $filename to GitHub!"
