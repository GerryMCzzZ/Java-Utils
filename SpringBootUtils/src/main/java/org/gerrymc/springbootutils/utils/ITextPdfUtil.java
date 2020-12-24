package org.gerrymc.springbootutils.utils;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author GerryMC
 * @Description PDF常用工具类
 * @date 2020/12/15
 */
public class ITextPdfUtil {

    /**
     * 根据需求设置字体
     */
    private static Font headfont;// 设置标题（头部）字体大小
    private static Font keyfont;// 设置加粗文本字体大小
    private static Font textfont;// 设置普通文本字体大小
    private static Font customfont;// 设置自定义其他字体大小

    /**
     * 构造前初始化字体
     */
    static {
        BaseFont bfChinese;
        try {
            bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);//支持中文

            headfont = new Font(bfChinese, 14, Font.BOLD);// 大小为10的粗体
            keyfont = new Font(bfChinese, 10, Font.BOLD);// 大小为8的粗体
            textfont = new Font(bfChinese, 10, Font.NORMAL);//大小为10的正常字体
            customfont = new Font(bfChinese, 8, Font.NORMAL);//大小为8的正常字体
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //测试
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        //创建pdf文件
        String path = "E:\\Private\\Test\\iTextPdf\\test1.pdf";

        //新建document对象  第一个参数是页面大小。接下来的参数分别是左、右、上和下页边距。
        Document document = new Document(PageSize.A4, 18, 18, 20, 40);

        PdfWriter.getInstance(document, new FileOutputStream(path));

        //打开
        document.open();

        Phrase phrase = new Phrase("hello, world！",customfont);
        document.add(phrase);

        //关闭
        document.close();
    }
}
