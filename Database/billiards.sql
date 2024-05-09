DROP TABLE USERLOGIN cascade constraints;
DROP TABLE HoaDon cascade constraints;
DROP TABLE CTHD cascade constraints;
DROP TABLE NhanVien cascade constraints;
DROP TABLE HoiVien cascade constraints;
DROP TABLE PhuThu cascade constraints;
DROP TABLE BanBilliard cascade constraints;
DROP TABLE DoUong cascade constraints;

create table USERLOGIN (
    id number generated always as identity primary key,
    username varchar2(100),
    password varchar2(100)
);


create table NhanVien (
    MaNV varchar2(4) PRIMARY KEY,
    TenNV varchar2(100),
    sdt varchar2(10),
    ngayVL Date,
    diachi varchar2(100),
    chucvu varchar2(50),
    hsluong number(*,0),
    giolam number(*,1)
    
);
insert into NhanVien (MaNV,TenNV,sdt,ngayVL,diachi,chucvu,hsluong,giolam) values ('NV01','Nguyễn Thị Hồng Ngọc','0123456789',TO_DATE('01/01/2024', 'dd/mm/yyyy'),'Linh Trung - Thủ Đức - TP.HCM','Quản Lý',50000,100.0);
insert into NhanVien (MaNV,TenNV,sdt,ngayVL,diachi,chucvu,hsluong,giolam) values ('NV02','Phạm Trần Dạ Thảo','0123456789',TO_DATE('01/01/2024', 'dd/mm/yyyy'),'Linh Trung - Thủ Đức - TP.HCM','Thu Ngân',35000,100.0);
insert into NhanVien (MaNV,TenNV,sdt,ngayVL,diachi,chucvu,hsluong,giolam) values ('NV03','Trần Thảo Quyên','0123456789',TO_DATE('01/01/2024', 'dd/mm/yyyy'),'Linh Trung - Thủ Đức - TP.HCM','Kế Toán',40000,100.0);
insert into NhanVien (MaNV,TenNV,sdt,ngayVL,diachi,chucvu,hsluong,giolam) values ('NV04','Ngô Nhựt Trường','0123456789',TO_DATE('01/01/2024', 'dd/mm/yyyy'),'Linh Trung - Thủ Đức - TP.HCM','Nhân Viên',30000,100.0);
insert into NhanVien (MaNV,TenNV,sdt,ngayVL,diachi,chucvu,hsluong,giolam) values ('NV05','Nguyễn Đình Tuấn','0123456789',TO_DATE('01/01/2024', 'dd/mm/yyyy'),'Linh Trung - Thủ Đức - TP.HCM','Nhân Viên',30000,100.0);

create table HoiVien (
    MaHV varchar2(4) PRIMARY KEY,
    TenHV varchar2(100),
    sdt varchar2(10),
    ngaydky Date,
    tongdiem number(*,1),
    tonggiochoi number(*,1),
    hang varchar2(100)
);
CREATE OR REPLACE TRIGGER update_hang
BEFORE INSERT OR UPDATE ON HoiVien
FOR EACH ROW
BEGIN
    IF :NEW.tonggiochoi >= 80 THEN
        :NEW.hang := 'Vàng';
    ELSIF :NEW.tonggiochoi >= 40 THEN
        :NEW.hang := 'Bạc';
    ELSIF :NEW.tonggiochoi >= 20 THEN
        :NEW.hang := 'Đồng';
    END IF;
END;
/
insert into HoiVien (MaHV,TenHV,sdt,ngaydky,tongdiem,tonggiochoi,hang) values ('HV01','Nguyễn Thị Hồng Ngọc','0823452446',TO_DATE('30/04/2024', 'dd/mm/yyyy'),10.0,30.0,'Đồng');
insert into HoiVien (MaHV,TenHV,sdt,ngaydky,tongdiem,tonggiochoi,hang) values ('HV02','Nguyễn Đình Tuấn','0123456789',TO_DATE('30/04/2024', 'dd/mm/yyyy'),30.0,60.0,'Vàng');
insert into HoiVien (MaHV,TenHV,sdt,ngaydky,tongdiem,tonggiochoi,hang) values ('HV03','Phạm Trần Dạ Thảo','0123456789',TO_DATE('30/04/2024', 'dd/mm/yyyy'),0.0,10.0,'');
insert into HoiVien (MaHV,TenHV,sdt,ngaydky,tongdiem,tonggiochoi,hang) values ('HV04','Trần Thảo Quyên','0123456789',TO_DATE('30/04/2024', 'dd/mm/yyyy'),20.0,20.0,'Đồng');
insert into HoiVien (MaHV,TenHV,sdt,ngaydky,tongdiem,tonggiochoi,hang) values ('HV05','Ngô Nhựt Trường','0123456789',TO_DATE('30/04/2024', 'dd/mm/yyyy'),23.0,45.0,'Bạc');

create table DoUong (
    MaDU varchar2(4) PRIMARY KEY,
    TenDU varchar2(100),
    soluong number,
    dongia number(*,0)
);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU01','N??c �p D?a',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU02','N??c �p Cam',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU03','N??c �p T�o',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU04','N??c �p Xo�i',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU05','N??c �p D?a H?u',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU06','N??c �p H?n H?p',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU07','Tr� S?a Truy?n Th?ng',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU08','Tr� S?a Matcha',20,25000);
insert into DoUong (MaDU,TenDU,soluong,dongia) values ('DU09','S?a T??i Tr�n Ch�u ???ng ?en',20,25000);


create table BanBilliard (
    MaBan varchar2(10) PRIMARY KEY,
    dongia number(*,0)
);
insert into BanBilliard (MaBan,dongia) values ('Pool01',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool02',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool03',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool04',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool05',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool06',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool07',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool08',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool09',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool10',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool11',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool12',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool13',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool14',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool15',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool16',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool17',80000);
insert into BanBilliard (MaBan,dongia) values ('Pool18',80000);
insert into BanBilliard (MaBan,dongia) values ('Libre01',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre02',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre03',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre04',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre05',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre06',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre07',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre08',70000);
insert into BanBilliard (MaBan,dongia) values ('Libre09',70000);

create table HoaDon (
    MaHD varchar2(4) PRIMARY KEY,
    ngay Date,
    trigia number(*,0),
    note varchar2(200)
);
create table CTHD (
    MaHD varchar2(4),
    MaHV varchar2(4),
    MaBan varchar2(10),
    giochoi number(*,1),
    MaDU varchar2(4),
    soluong number,
    giovao timestamp,
    giora timestamp,
    giamgia number(*,0),
    ptthanhtoan varchar2(20),
    
    PRIMARY KEY (MaHD, MaHV, MaBan, MaDU),
    
    CONSTRAINT fk_MaHD FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT fk_MaBan FOREIGN KEY (MaBan) REFERENCES BanBilliard(MaBan),
    CONSTRAINT fk_MaDU FOREIGN KEY (MaDU) REFERENCES DoUong(MaDU),
    CONSTRAINT fk_MaHV FOREIGN KEY (MaHV) REFERENCES HoiVien(MaHV)
);

create table PhuThu (
    MaPT varchar2(4) PRIMARY KEY,
    vande varchar2(100),
    nguyennhan varchar2(200),
    xuli varchar2(100),
    chiphi number
);
select * from HoiVien;



