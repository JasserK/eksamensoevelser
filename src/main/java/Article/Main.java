package Article;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Breaking", "Apart from counting words and characters our online editor can help you to improve word choice and writing style, and, optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing. You'll see the number of characters and words increase or decrease as you type, delete, and edit them. You can also copy and paste text from another program over into the online editor above. The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later", "Jasser");

        System.out.println(article.getLongestWord());
    }
}
