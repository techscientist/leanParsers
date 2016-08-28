import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String topic;
	public String background_image;
	public String description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String logo;
	public String start_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;
	public String name;
	public CopyrightModel _copyright;
	public int id;
	public String email;
	public String organizer_name;
	public String privacy;
	public String location_name;
	public String organizer_description;
	public String schedule_published_on;
	public VersionModel _version;

	public RootModel(String timezone, String topic, String background_image, String description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String type, String logo, String start_time, String code_of_conduct, Call_for_papersModel call_for_papers, String end_time, String state, String name, CopyrightModel copyright, int id, String email, String organizer_name, String privacy, String location_name, String organizer_description, String schedule_published_on, VersionModel version) {

		this.timezone = timezone;
		this.topic = topic;
		this.background_image = background_image;
		this.description = description;
		this._creator = creator;
		this.social_links = social_links;
		this.type = type;
		this.logo = logo;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;
		this.name = name;
		this._copyright = copyright;
		this.id = id;
		this.email = email;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;

	}

}