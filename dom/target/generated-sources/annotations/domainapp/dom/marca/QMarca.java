package domainapp.dom.marca;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QMarca extends PersistableExpressionImpl<Marca> implements PersistableExpression<Marca>
{
    public static final QMarca jdoCandidate = candidate("this");

    public static QMarca candidate(String name)
    {
        return new QMarca(null, name, 5);
    }

    public static QMarca candidate()
    {
        return jdoCandidate;
    }

    public static QMarca parameter(String name)
    {
        return new QMarca(Marca.class, name, ExpressionType.PARAMETER);
    }

    public static QMarca variable(String name)
    {
        return new QMarca(Marca.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> NAME_LENGTH;
    public final StringExpression nombre;
    public final ObjectExpression<org.apache.isis.applib.value.Blob> attachment;
    public final NumericExpression<Integer> NOTES_LENGTH;
    public final StringExpression notes;
    public final ObjectExpression<org.apache.isis.applib.services.repository.RepositoryService> repositoryService;
    public final ObjectExpression<org.apache.isis.applib.services.title.TitleService> titleService;
    public final ObjectExpression<org.apache.isis.applib.services.message.MessageService> messageService;

    public QMarca(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.NAME_LENGTH = new NumericExpressionImpl<Integer>(this, "NAME_LENGTH");
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.attachment = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "attachment");
        this.NOTES_LENGTH = new NumericExpressionImpl<Integer>(this, "NOTES_LENGTH");
        this.notes = new StringExpressionImpl(this, "notes");
        this.repositoryService = new ObjectExpressionImpl<org.apache.isis.applib.services.repository.RepositoryService>(this, "repositoryService");
        this.titleService = new ObjectExpressionImpl<org.apache.isis.applib.services.title.TitleService>(this, "titleService");
        this.messageService = new ObjectExpressionImpl<org.apache.isis.applib.services.message.MessageService>(this, "messageService");
    }

    public QMarca(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.NAME_LENGTH = new NumericExpressionImpl<Integer>(this, "NAME_LENGTH");
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.attachment = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "attachment");
        this.NOTES_LENGTH = new NumericExpressionImpl<Integer>(this, "NOTES_LENGTH");
        this.notes = new StringExpressionImpl(this, "notes");
        this.repositoryService = new ObjectExpressionImpl<org.apache.isis.applib.services.repository.RepositoryService>(this, "repositoryService");
        this.titleService = new ObjectExpressionImpl<org.apache.isis.applib.services.title.TitleService>(this, "titleService");
        this.messageService = new ObjectExpressionImpl<org.apache.isis.applib.services.message.MessageService>(this, "messageService");
    }
}
