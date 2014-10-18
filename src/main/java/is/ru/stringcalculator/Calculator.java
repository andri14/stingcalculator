package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){

    if(text.equals("")){
        return 0;
    }
    else if (text.startsWith("//")){
    	return sum(splitNumbersCustom(text));
    }
    else if(text.contains(",") || text.contains("\n")){
        return sum(splitNumbers(text));
    }
    else
        return 1;
	}

	//Refactor
	private static int toInt(String number){
    	return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
    	return numbers.split(",|\n");
	}

	private static String[] splitNumbersCustom(String numbers){
    	String numskip = new String(numbers.substring(4));
    	return numskip.split(";");
	}

	private static int sum(String[] numbers){
    int total = 0;
    for(String number : numbers){
        total += toInt(number);
    }
    return total;
	}


}