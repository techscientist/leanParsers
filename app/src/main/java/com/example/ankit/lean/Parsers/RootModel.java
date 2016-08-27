import java.util.ArrayList;

class RootModel {

	public String logo;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String timezone;
	public String background_image;
	public String state;
	public String type;
	public String schedule_published_on;
	public String location_name;
	public String end_time;
	public String organizer_description;
	public String name;
	public String organizer_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String start_time;
	public String email;
	public int id;
	public CopyrightModel _copyright;
	public VersionModel _version;

	public RootModel(String logo, String topic, Call_for_papersModel call_for_papers, String description, String timezone, String background_image, String state, String type, String schedule_published_on, String location_name, String end_time, String organizer_description, String name, String organizer_name, CreatorModel creator, String code_of_conduct, ArrayList<Social_linksModel> social_links, String privacy, String start_time, String email, int id, CopyrightModel copyright, VersionModel version) {

		this.logo = logo;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.timezone = timezone;
		this.background_image = background_image;
		this.state = state;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.privacy = privacy;
		this.start_time = start_time;
		this.email = email;
		this.id = id;
		this._copyright = copyright;
		this._version = version;

	}

}