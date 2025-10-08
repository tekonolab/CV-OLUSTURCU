package com.benim;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;

public class CVOlusturucu {

    public static void main(String[] args) {
        try {
            // PDF dosyasının adı
            String dosyaAdi = "Benim-CV.pdf";

            System.out.println("PDF oluşturuluyor...");

            // PDF oluştur
            PdfWriter writer = new PdfWriter(dosyaAdi);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            // FOTOĞRAF EKLE
            try {
                Image img = new Image(ImageDataFactory.create("photo.jpg"));
                img.setWidth(100);
                img.setHeight(100);
                img.setFixedPosition(450, 700);
                document.add(img);
                System.out.println("✓ Fotoğraf eklendi");
            } catch (Exception ex) {
                System.out.println("! Fotoğraf yüklenemedi (photo.jpg bulunamadı)");
                System.out.println("  Proje klasörüne photo.jpg ekleyin");
            }

            // BAŞLIK - İsim Soyisim
            Paragraph baslik = new Paragraph("KARL MARX")
                    .setFontSize(24)
                    .setBold()
                    .setFontColor(ColorConstants.BLUE);
            document.add(baslik);

            // KİŞİSEL BİLGİLER
            document.add(new Paragraph("KİŞİSEL BİLGİLER")
                    .setFontSize(16)
                    .setBold()
                    .setMarginTop(20));

            document.add(new Paragraph("Email: ahmet.yilmaz@email.com"));
            document.add(new Paragraph("Telefon: 0555 123 4567"));
            document.add(new Paragraph("Adres: İstanbul, Türkiye"));
            document.add(new Paragraph("Doğum Tarihi: 15 Mart 1998"));

            // İŞ DENEYİMLERİ
            document.add(new Paragraph("İŞ DENEYİMLERİ")
                    .setFontSize(16)
                    .setBold()
                    .setMarginTop(20));

            // 1. İş
            document.add(new Paragraph("Yazılım Geliştirici")
                    .setFontSize(12)
                    .setBold()
                    .setMarginTop(10));
            document.add(new Paragraph("ABC Teknoloji A.Ş. | Ocak 2022 - Devam Ediyor")
                    .setFontSize(10)
                    .setItalic());
            document.add(new Paragraph("Java ve Spring Boot ile kurumsal web uygulamaları geliştirdim. " +
                    "Mikroservis mimarisi kullanarak RESTful API'ler tasarladım. " +
                    "Docker ve Kubernetes ile deployment süreçlerini yönettim.")
                    .setMarginLeft(10));

            // 2. İş
            document.add(new Paragraph("Junior Yazılım Geliştirici")
                    .setFontSize(12)
                    .setBold()
                    .setMarginTop(10));
            document.add(new Paragraph("XYZ Yazılım Ltd. | Haziran 2020 - Aralık 2021")
                    .setFontSize(10)
                    .setItalic());
            document.add(new Paragraph("E-ticaret projeleri geliştirdim. MySQL ve PostgreSQL veritabanı yönetimi yaptım. " +
                    "Frontend tarafında HTML, CSS ve JavaScript kullandım. " +
                    "Git ile versiyon kontrolü ve takım çalışması deneyimi kazandım.")
                    .setMarginLeft(10));

            // 3. İş
            document.add(new Paragraph("Stajyer Yazılım Geliştirici")
                    .setFontSize(12)
                    .setBold()
                    .setMarginTop(10));
            document.add(new Paragraph("Tech Solutions | Temmuz 2019 - Eylül 2019")
                    .setFontSize(10)
                    .setItalic());
            document.add(new Paragraph("Java temellerini öğrendim ve basit CRUD uygulamaları geliştirdim. " +
                    "Agile metodolojileri ve Scrum çerçevesinde çalıştım. " +
                    "Ekip içinde kod review süreçlerine katıldım.")
                    .setMarginLeft(10));

            // EĞİTİM
            document.add(new Paragraph("EĞİTİM")
                    .setFontSize(16)
                    .setBold()
                    .setMarginTop(20));

            document.add(new Paragraph("Bilgisayar Mühendisliği (Lisans)")
                    .setFontSize(12)
                    .setBold());
            document.add(new Paragraph("İstanbul Teknik Üniversitesi | 2016 - 2020")
                    .setFontSize(10));
            document.add(new Paragraph("Not Ortalaması: 3.45/4.00"));

            // BECERİLER
            document.add(new Paragraph("BECERİLER")
                    .setFontSize(16)
                    .setBold()
                    .setMarginTop(20));

            document.add(new Paragraph(
                    "Programlama Dilleri: Java, Python, JavaScript\n" +
                            "Framework: Spring Boot, Hibernate, React\n" +
                            "Veritabanı: MySQL, PostgreSQL, MongoDB\n" +
                            "Araçlar: Git, Docker, Jenkins, Maven\n" +
                            "Diğer: RESTful API, Mikroservis Mimarisi, Agile/Scrum")
                    .setMarginLeft(10));

            // SERTİFİKALAR
            document.add(new Paragraph("SERTİFİKALAR")
                    .setFontSize(16)
                    .setBold()
                    .setMarginTop(20));

            document.add(new Paragraph("• Oracle Certified Java Programmer (2021)\n" +
                    "• AWS Certified Developer Associate (2022)")
                    .setMarginLeft(10));

            // DİLLER
            document.add(new Paragraph("DİLLER")
                    .setFontSize(16)
                    .setBold()
                    .setMarginTop(20));

            document.add(new Paragraph("• Türkçe (Ana Dil)\n" +
                    "• İngilizce (İleri Seviye - TOEFL: 95)")
                    .setMarginLeft(10));

            // PDF'i kapat
            document.close();

            System.out.println("===================================");
            System.out.println("✓ CV başarıyla oluşturuldu!");
            System.out.println("✓ Dosya adı: " + dosyaAdi);
            System.out.println("✓ Proje klasöründe bulabilirsiniz");
            System.out.println("===================================");

        } catch (Exception e) {
            System.out.println("HATA OLUŞTU!");
            System.out.println("Hata mesajı: " + e.getMessage());
            e.printStackTrace();
        }
    }
}