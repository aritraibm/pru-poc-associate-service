package com.pru.test.associate.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.pru.test.associate.service.entity.Associate;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


@Service
public class AssociateExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Associate> listAssociates;

	public AssociateExcelExporter(List<Associate> listAssociates) {
        this.listAssociates = listAssociates;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("Resource Backup");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(10);
        style.setFont(font);
              
        createCell(row, 0, "Engagement Name", style); 
        createCell(row, 1, "Major Function", style); 
        createCell(row, 2, "Associate Name", style);  
        createCell(row, 3, "Band", style); 
        createCell(row, 4, "Primary Contact", style); 
        createCell(row, 5, "Email IBM", style); 
        createCell(row, 6, "Email Pru", style); 
        createCell(row, 7, "XID", style); 
        createCell(row, 8, "Prudential Manager", style); 
        //end date
        createCell(row, 9, "Location", style); 
        createCell(row, 10, "City", style); 
        createCell(row, 11, "Bill Type", style); 
        createCell(row, 12, "Bill Code", style); 
        createCell(row, 13, "Team/Role", style); 
        //As on Date	
        //Pru Exp Date	
        //IT Exp Date	
        //IBM Date
        createCell(row, 14, "Experience with Prudential", style); 
        createCell(row, 15, "Career Experience", style); 
        createCell(row, 16, "Experience with IBM	Skillset", style); 
        createCell(row, 17, "Resource Criticality", style); 
        createCell(row, 18, "At Immigration / visa risks	", style); 
        //createCell(row, 19, "Backup/Successor Resource", style); 
        createCell(row, 19, "Key Contingency Group", style); 
        createCell(row, 20, "Additional  Contingency", style); 
        createCell(row, 21, "Visa Type", style); 
        createCell(row, 22, "Work Permit Valid Until", style); 
        createCell(row, 23, "Extension Updates", style); 
        //Visa Max Out Date
        createCell(row, 24, "Time Left in US", style); 
        createCell(row, 25, "H1B Nominations	Risk/Mitigation/Comments", style); 
        createCell(row, 26, "Plan in case of extension/amendment rejection", style); 
        createCell(row, 27, "Active/Inactive", style);   
         
    }
     
    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
     
    private void writeDataLines() {
        int rowCount = 1;
 
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(10);
        style.setFont(font);
                 
        for (Associate user : listAssociates) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             

            createCell(row, columnCount++, user.getEngagementName(), style);
            createCell(row, columnCount++, user.getMajorFunction(), style);
            createCell(row, columnCount++, user.getAssociateName(), style);
            createCell(row, columnCount++, user.getBand(), style);
            createCell(row, columnCount++, user.getPrimaryContact(), style);
            createCell(row, columnCount++, user.getEmailIbm(), style);
            createCell(row, columnCount++, user.getEmailPru(), style);
            createCell(row, columnCount++, user.getXid(), style);
            createCell(row, columnCount++, user.getPrudentialManager(), style);
            createCell(row, columnCount++, user.getLocation(), style);
            createCell(row, columnCount++, user.getCity(), style);
            createCell(row, columnCount++, user.getBillType(), style);
            createCell(row, columnCount++, user.getBillCode(), style);
            createCell(row, columnCount++, user.getTeamOrRole(), style);
            createCell(row, columnCount++, user.getExperienceWithPru(), style);
            createCell(row, columnCount++, user.getCareerExperience(), style);
            createCell(row, columnCount++, user.getExperienceWithIbm(), style);
            createCell(row, columnCount++, user.getResourceCriticality(), style);
            createCell(row, columnCount++, user.getAtImmigrationVisaRisks(), style);
            //createCell(row, columnCount++, user.getBackupSuccessorResource(), style);
            createCell(row, columnCount++, user.getKeyContingencyGroup(), style);
            createCell(row, columnCount++, user.getAdditionalContingency(), style);
            createCell(row, columnCount++, user.getVisaType(), style);
            createCell(row, columnCount++, user.getWorkPermitValidUntil(), style);
            createCell(row, columnCount++, user.getExtensionUpdates(), style);
            createCell(row, columnCount++, user.getTimeLeftInUs(), style);
            createCell(row, columnCount++, user.getH1bNominations(), style);
            createCell(row, columnCount++, user.getPlanInCaseOfExtensionAmendmentRejection(), style);
            createCell(row, columnCount++, user.getActiveInactive(), style);
             
        }
    }
     
    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();
         
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
         
        outputStream.close();
         
    }
}
