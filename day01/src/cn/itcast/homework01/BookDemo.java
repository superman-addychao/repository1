package cn.itcast.homework01;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        String[] names = {"《海底捞，你学不会》", "《混子曰》", "《腾讯传》"};
        Double[] prices = {20.0, 18.0, 15.0};

        // 实例化3个Book类对象，并采用有参构造方法初始化对象数据.
        // 需要特别注意：for循环中的数组长度3不能用length()替代，因为刚开始循环时，length等于0，会导致循环无法启动
        for (int i = 0; i < 3; i++) {
            Book book = new Book(i, names[i], prices[i]);
            // 把每个图书对象放到数组中
            books[i] = book;
        }

        showBookDetails(books);

        getMaxDetails(books);
    }

    // 此方法获取最贵图书的详细信息
    public static void getMaxDetails(Book[] books) {
        // 初始化最贵图书为第一本
        double max = books[0].getPrice();
        // max_index变量用来记录每一次比较价格大小时，价格较贵的图书的索引，最终比较完后得到的便是最贵图书的索引
        int max_index = 0;

        for (int i = 1; i < books.length; i++) {
            if (books[i].getPrice()>max){
        // 注意max = books[i].getPrice();这一步不能省略，否则后面每循环一次，都是在跟第一本数的价格比大小。
        // 假如循环到最后一本书，只要最后一本书的价格比第一本贵，那得到的最贵图书索引便是最后一本
                max = books[i].getPrice();
                max_index = i;
            }
        }

        System.out.println("价格最贵的图书信息如下：");
        System.out.println("--------------------------------------");
        System.out.println("序号：" + books[max_index].getNum());
        System.out.println("书名：" + books[max_index].getName());
        System.out.println("价格：" + books[max_index].getPrice());

    }


    //  此方法用来展示全部图书信息
    public static void showBookDetails(Book[] books) {
        System.out.println("三本书的详细信息如下：");
        System.out.println("--------------------------------------");

        for (int i = 0; i < books.length; i++) {
            System.out.println("图书" + i + "的序号：" + books[i].getNum());
            System.out.println("图书" + i + "的书名：" + books[i].getName());
            System.out.println("图书" + i + "的价格：" + books[i].getPrice());
            System.out.println();
            System.out.println("--------------------------------------");
        }
    }


}
