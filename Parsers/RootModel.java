import java.util.ArrayList;

class RootModel {

	public String type;
	public String name;
	public CreatorModel _creator;
	public String logo;
	public CopyrightModel _copyright;
	public String timezone;
	public String email;
	public String organizer_description;
	public String background_image;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String description;
	public String organizer_name;
	public String location_name;
	public String privacy;
	public String schedule_published_on;
	public String start_time;
	public String topic;
	public String state;
	public String end_time;
	public VersionModel _version;

	public RootModel(String type, String name, CreatorModel creator, String logo, CopyrightModel copyright, String timezone, String email, String organizer_description, String background_image, String code_of_conduct, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, int id, String description, String organizer_name, String location_name, String privacy, String schedule_published_on, String start_time, String topic, String state, String end_time, VersionModel version) {

		this.type = type;
		this.name = name;
		this._creator = creator;
		this.logo = logo;
		this._copyright = copyright;
		this.timezone = timezone;
		this.email = email;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.description = description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.topic = topic;
		this.state = state;
		this.end_time = end_time;
		this._version = version;

	}

}