public class z41 {
    public static void main(String[] args){
        System.out.println(time(10000));
    }
    public static String time(int num) {
        int years = num / 31536000;
        num -= years * 31536000;
        int months = num / 2592000;
        num -= months * 2592000;
        int weeks = num / 604800;
        num -= weeks * 604800;
        int days = num / 86400;
        num -= days * 86400;
        int h = num / 3600;
        num -= h * 3600;
        int min = num / 60;
        num -= min * 60;

        StringBuilder strBox = new StringBuilder();
        if (years > 0) {
            strBox.append(endingNumber(years, "год", "года", "лет"));
        }
        if (months > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(months, "месяц", "месяца", "месяцев"));
        }
        if (weeks > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(weeks, "неделя", "недели", "недель"));
        }

        if (days > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(days, "день", "дня", "дней"));
        }

        if (h > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(h, "час", "часа", "часов"));
        }

        if (min > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(min, "минута", "минуты", "минут"));
        }

        if (num > 0) {
            appendAnd(strBox);
            strBox.append(endingNumber(num, "секунда", "секунды", "секунд"));
        }
        return strBox.toString();
    }
    static void appendСomma(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }
    static void appendAnd(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(" и ");
        }
    }

    static String endingNumber(int num, String... arr) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return String.format("%d %s", num, arr[2]);
        }

        int lastDigit = num % 10;
        switch (lastDigit) {
            case 1:
                return String.format("%d %s", num, arr[0]);
            case 2:
            case 3:
            case 4:
                return String.format("%d %s", num, arr[1]);
            default:
                return String.format("%d %s", num, arr[2]);
        }
    }
}