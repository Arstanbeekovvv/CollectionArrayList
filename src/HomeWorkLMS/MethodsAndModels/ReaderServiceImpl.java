package HomeWorkLMS.MethodsAndModels;
import HomeWorkLMS.Models.Reader;
import HomeWorkLMS.Db.DateBase;

import java.util.List;

public class ReaderServiceImpl implements ReaderService{
    @Override
    public void saveReader(Reader reader) {
        DateBase.readers.add(reader);
    }

    @Override
    public void getAllReaders() {
        for (Reader reader : DateBase.readers) {
            System.out.println(reader);
        }
    }

    @Override
    public Reader getReaderById(Long id) {
        int indexReaders = 0;
        for (int i = 0; i < DateBase.readers.size(); i++) {
            if(DateBase.readers.get(i).getId() == id){
                indexReaders = i;
            }
        }
        return DateBase.readers.get(indexReaders);
    }

    @Override
    public void updateReader(Long id, Reader reader) {
        for (int i = 0; i < DateBase.readers.size(); i++) {
            if(DateBase.readers.get(i).getId() == id){
                DateBase.readers.set(i, reader);
            }
        }
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (int i = 0; i < DateBase.libraries.size(); i++) {
            if(DateBase.libraries.get(i).getId() == libraryId){
                for (int j = 0;j < DateBase.readers.size(); j++) {
                    if(DateBase.readers.get(j).getId() == readerId){
                        DateBase.libraries.get(i).getReaders().add(DateBase.readers.get(i));
                    }
                }
            }
        }
    }
}
