package com.example.zzc.greendaopratise;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.zzc.student.DaoSession;
import com.example.zzc.student.Student;
import com.example.zzc.student.StudentDao;
import com.example.zzc.student.TeacherDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity" ;
    private StudentDao studentDao;
    private TeacherDao teacherDao;
    static int age=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaoSession daoSession =((Myapp)getApplication()).getDaoSession();
        studentDao = daoSession.getStudentDao();
        teacherDao = daoSession.getTeacherDao();
    }
    public void add(View v){
        ;
        Student student=new Student();
        student.setAge(age);
        student.setDate(new Date());
        student.setName("WJW");
        student.setText("rousi");
        studentDao.insert(student);
        Log.i(TAG,student.toString());
        age++;

    }
    public void delete(View v){
        QueryBuilder<Student> studentQueryBuilder =
                studentDao.queryBuilder().where(StudentDao.Properties.Age.eq(10));
        List<Student> studentList = studentQueryBuilder.list();
        Student student1 = studentList.get(0);
      studentDao.delete(student1);
    }
    public void modify(View v){
        QueryBuilder<Student> studentQueryBuilder =
                studentDao.queryBuilder().where(StudentDao.Properties.Age.eq(11));
        List<Student> studentList = studentQueryBuilder.list();
        Student student1 = studentList.get(0);
        student1.setText("heisi");
      studentDao.update(student1);
    }
    public void qury(View v){
        QueryBuilder<Student> studentQueryBuilder =
                studentDao.queryBuilder().where(StudentDao.Properties.Age.eq(11));
        List<Student> studentList = studentQueryBuilder.list();
        Student student1 = studentList.get(0);
        Log.i(TAG,student1.toString());

    }


}
