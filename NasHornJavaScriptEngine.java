package java_8_tutorials_point;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class NasHornJavaScriptEngine {
	public static void main(String args[]) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		String name = "Mahesh";
		Integer result = null;
		try {
			nashorn.eval("print('" + name + "')");
			result = (Integer) nashorn.eval("10 + 2");
		} catch (ScriptException e) {
			System.out.println("Error executing script: " + e.getMessage());
		}
		System.out.println(result.toString());
	}
}

/*
js
print('Hello World!');
Open console and use the following command.
$ jjs sam ple.js
It will produce the following output:
Hello World!
jjs in Interactive Mode
Open the console and use the following command.
$ jjs
jjs> print("Hello, World!")
Hello, World!
jjs> quit()
>> */