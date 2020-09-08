import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.fields.layout.field.FieldLayoutManager
import com.atlassian.jira.project.Project
import org.apache.log4j.Level
import org.apache.log4j.Logger

def log = Logger.getLogger("Log: ")
log.setLevel(Level.DEBUG)

FieldLayoutManager test = ComponentAccessor.
