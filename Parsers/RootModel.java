import java.util.ArrayList;

class RootModel {

	public String logo;
	public int id;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String start_time;
	public String email;
	public String timezone;
	public String schedule_published_on;
	public String topic;
	public String code_of_conduct;
	public String location_name;
	public String organizer_name;
	public String organizer_description;
	public String privacy;
	public String description;
	public String background_image;
	public String end_time;
	public String state;
	public CopyrightModel _copyright;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;

	public RootModel(String logo, int id, CreatorModel creator, ArrayList<Social_linksModel> social_links, String name, String start_time, String email, String timezone, String schedule_published_on, String topic, String code_of_conduct, String location_name, String organizer_name, String organizer_description, String privacy, String description, String background_image, String end_time, String state, CopyrightModel copyright, String type, Call_for_papersModel call_for_papers, VersionModel version) {

		this.logo = logo;
		this.id = id;
		this._creator = creator;
		this.social_links = social_links;
		this.name = name;
		this.start_time = start_time;
		this.email = email;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.description = description;
		this.background_image = background_image;
		this.end_time = end_time;
		this.state = state;
		this._copyright = copyright;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._version = version;

	}

}