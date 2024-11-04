package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> number, List<String> urls){
        this.numbers = number;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < urls.size(); i++) {
            if (!urls.get(i).matches(".*\\d.*")) {
                text.append(String.format("Browsing... %s!", urls.get(i)));
            } else {
                text.append("Invalid URL!");
            }

            if(i != urls.size() - 1)
                text.append("\n");
        }
        return text.toString();
    }

    @Override
    public String call() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).matches("\\d+")) {
                text.append(String.format("Calling... %s", numbers.get(i)));
            } else {
                text.append("Invalid number!");
            }

            if(i != numbers.size() - 1)
                text.append("\n");
        }
        return text.toString();
    }
}
