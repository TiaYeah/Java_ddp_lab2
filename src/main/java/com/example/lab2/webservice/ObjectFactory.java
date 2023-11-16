
package com.example.lab2.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.lab2.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoTurn_QNAME = new QName("http://lab2.example.com/", "doTurn");
    private final static QName _DoTurnResponse_QNAME = new QName("http://lab2.example.com/", "doTurnResponse");
    private final static QName _GetModel_QNAME = new QName("http://lab2.example.com/", "getModel");
    private final static QName _GetModelResponse_QNAME = new QName("http://lab2.example.com/", "getModelResponse");
    private final static QName _GetName_QNAME = new QName("http://lab2.example.com/", "getName");
    private final static QName _GetNameResponse_QNAME = new QName("http://lab2.example.com/", "getNameResponse");
    private final static QName _GetState_QNAME = new QName("http://lab2.example.com/", "getState");
    private final static QName _GetStateResponse_QNAME = new QName("http://lab2.example.com/", "getStateResponse");
    private final static QName _SayHello_QNAME = new QName("http://lab2.example.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://lab2.example.com/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.lab2.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoTurn }
     * 
     */
    public DoTurn createDoTurn() {
        return new DoTurn();
    }

    /**
     * Create an instance of {@link DoTurnResponse }
     * 
     */
    public DoTurnResponse createDoTurnResponse() {
        return new DoTurnResponse();
    }

    /**
     * Create an instance of {@link GetModel }
     * 
     */
    public GetModel createGetModel() {
        return new GetModel();
    }

    /**
     * Create an instance of {@link GetModelResponse }
     * 
     */
    public GetModelResponse createGetModelResponse() {
        return new GetModelResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetState }
     * 
     */
    public GetState createGetState() {
        return new GetState();
    }

    /**
     * Create an instance of {@link GetStateResponse }
     * 
     */
    public GetStateResponse createGetStateResponse() {
        return new GetStateResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link ServerMessage }
     * 
     */
    public ServerMessage createServerMessage() {
        return new ServerMessage();
    }

    /**
     * Create an instance of {@link Model }
     * 
     */
    public Model createModel() {
        return new Model();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTurn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoTurn }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "doTurn")
    public JAXBElement<DoTurn> createDoTurn(DoTurn value) {
        return new JAXBElement<DoTurn>(_DoTurn_QNAME, DoTurn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTurnResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoTurnResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "doTurnResponse")
    public JAXBElement<DoTurnResponse> createDoTurnResponse(DoTurnResponse value) {
        return new JAXBElement<DoTurnResponse>(_DoTurnResponse_QNAME, DoTurnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "getModel")
    public JAXBElement<GetModel> createGetModel(GetModel value) {
        return new JAXBElement<GetModel>(_GetModel_QNAME, GetModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "getModelResponse")
    public JAXBElement<GetModelResponse> createGetModelResponse(GetModelResponse value) {
        return new JAXBElement<GetModelResponse>(_GetModelResponse_QNAME, GetModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetState }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "getState")
    public JAXBElement<GetState> createGetState(GetState value) {
        return new JAXBElement<GetState>(_GetState_QNAME, GetState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "getStateResponse")
    public JAXBElement<GetStateResponse> createGetStateResponse(GetStateResponse value) {
        return new JAXBElement<GetStateResponse>(_GetStateResponse_QNAME, GetStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lab2.example.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
