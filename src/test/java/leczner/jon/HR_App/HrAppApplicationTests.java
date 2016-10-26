package leczner.jon.HR_App;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HrAppApplicationTests {
//	private final String SPRING_BOOT_MATCH = "Spring Boot";
//	private final String CLOUD_MATCH = "Cloud";
//	@SuppressWarnings("rawtypes")
//	private HttpMessageConverter mappingJackson2HttpMessageConverter;
//	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
//			MediaType.APPLICATION_JSON.getSubtype(),
//			Charset.forName("utf8"));
//	private MockMvc mockMvc;
//117
//	CHAPTER 6 ■ TESTING WITH SPRING BOOT @Autowired
//	private WebApplicationContext webApplicationContext;
//	@Autowired
//	void setConverters(HttpMessageConverter<?>[] converters) {
//		this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream().
//				filter(
//						converter -> converter instanceof MappingJackson2HttpMessageConverter).
//				findAny().get();
//	}
//	@Before
//	public void setup() throws Exception {
//		this.mockMvc = webAppContextSetup(webApplicationContext).build();
//	}
//	@Test
//	public void getAll() throws Exception {
//		mockMvc.perform(get("/journal/all"))
//				.andExpect(status().isOk())
//				.andExpect(content().contentType(contentType))
//				.andExpect(jsonPath("$",iterableWithSize(5)))
//				.andExpect(jsonPath("$[0]['title']",containsString(SPRING_BOOT_MATCH)));
//	}
//	@Test
//	public void findByTitle() throws Exception {
//		mockMvc.perform(get("/journal/findBy/title/" + CLOUD_MATCH))
//				.andExpect(status().isOk())
//				.andExpect(content().contentType(contentType))
//				.andExpect(jsonPath("$",iterableWithSize(1)))
//				.andExpect(jsonPath("$[0]['title']",containsString(CLOUD_MATCH)));
//	}
//	@Test
//	public void add() throws Exception {
//		mockMvc.perform(post("/journal")
//				.content(this.toJsonString(new JournalEntry("Spring Boot Testing","Create
//						Spring Boot Tests","05/09/2016")))
//						.contentType(contentType)).andExpect(status().isOk());
//	}
//	@SuppressWarnings("unchecked")
//	protected String toJsonString(Object obj) throws IOException {
//		MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
//		this.mappingJackson2HttpMessageConverter.write(obj, MediaType.APPLICATION_JSON,
//				mockHttpOutputMessage);
//		return mockHttpOutputMessage.getBodyAsString();
//	}
}
