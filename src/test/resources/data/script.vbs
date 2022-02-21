Set WshShell = WScript.CreateObject("WScript.Shell")
WshShell.SendKeys "src\test\resources\data\filedata.txt"
WshShell.SendKeys "{ENTER}"