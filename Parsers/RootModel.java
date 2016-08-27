import java.util.ArrayList;

class RootModel {

	public String logo;
	public String name;
	public String timezone;
	public String end_time;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String state;
	public CopyrightModel _copyright;
	public int id;
	public String email;
	public String type;
	public String background_image;
	public String location_name;
	public String schedule_published_on;
	public String start_time;
	public String organizer_name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String privacy;
	public VersionModel _version;

	public RootModel(String logo, String name, String timezone, String end_time, String topic, String code_of_conduct, String description, String state, CopyrightModel copyright, int id, String email, String type, String background_image, String location_name, String schedule_published_on, String start_time, String organizer_name, CreatorModel creator, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_description, String privacy, VersionModel version) {

		this.logo = logo;
		this.name = name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.state = state;
		this._copyright = copyright;
		this.id = id;
		this.email = email;
		this.type = type;
		this.background_image = background_image;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._version = version;

	}

}