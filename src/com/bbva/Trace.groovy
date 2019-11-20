public class Trace {
    public String NS = "user.e049773"
    public String MR_TYPE = "model-type"
    public String MR = "model"
    
    String CERT_FILE = "/home/e049773/Downloads/certs/personal/cert.pem"
    String KEY_FILE = "/home/e049773/Downloads/certs/personal/key.pem"
    
    def public String TraceId = 'id'
    def public text = 'insert text here'
    


    def public test(jobID){
        // GET
        
        println('Hola'+jobID)

        this.text = 'Holaaaa: '+ jobID
        def url = new URL("http://localhost:8080/job/testGroovy/"+jobID+"/wfapi/describe").openConnection()
        URLConnection uc = url.openConnection();
        String userpass = "admin:admin"
        String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));
        uc.setRequestProperty ("Authorization", basicAuth);
        InputStream in = uc.getInputStream();
        println(in)

    }

    def public sendTraceToSEMaaSViaFileDeltaAgent(jobID){
        // GET
        println(jobID)
        // def http = new HTTPBuilder(url)
        // http.auth.basic 'admin','admin'
        
        def url = new URL("http://localhost:8080/job/testGroovy/"+jobID+"/wfapi/describe")
        def urlConnection = url.openConnection()
        urlConnection.setDoOutput(true)
        urlConnection.setRequestMethod("GET")
        def authString = "admin:admin".getBytes().encodeBase64().toString()
        urlConnection.setRequestProperty("Authorization", "Basic ${authString}")
        urlConnection.setRequestProperty("Content-Type", "application/json")


        def get = new URL("http://localhost:8080/job/testGroovy/"+jobID+"/wfapi/describe").openConnection()
        def getRC = get.getResponseCode()
        println(getRC)
        if(getRC.equals(200)) {
            this.text=get.getInputStream().getText()
            println(this.text)
        }
    }
    
    // def Pipeline (String pipelineId){
    //         this.pipelineId = pipelineId
    // }

}
    
    


    

    //     for i in range(random.randint(3, 5)):
    //         st = step.Step(self.pipelineId)
    //         st.stepId = 'step_' + str(i)
    //         st.trace.traceId = self.trace.traceId
    //         st.trace.parentSpan = self.trace.spanId
    //         st.trace.spanKey = st.stepId
    //         self.steps.append(st)

    //     for i in range(random.randint(3, 10)):
    //         time.sleep(random.randint(1, 100)/1000)
    //         tmp = log.Log()
    //         self.trace.endTime = tmp.logTime
    //         tmp.traceId = self.trace.traceId
    //         tmp.spanId = self.trace.spanId
    //         tmp.parentSpan = self.trace.spanId
    //         self.logs.append(tmp)

    // def __del__(self):
    //     self.trace.endTime = int(time.time() * 1000000000)