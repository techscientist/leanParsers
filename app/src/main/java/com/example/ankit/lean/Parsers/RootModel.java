import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String timezone;
	public String state;
	public String name;
	public String topic;
	public CopyrightModel _copyright;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String privacy;
	public String background_image;
	public VersionModel _version;
	public String start_time;
	public String email;
	public String organizer_name;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String logo;
	public String location_name;
	public String description;

	public RootModel(String organizer_description, String timezone, String state, String name, String topic, CopyrightModel copyright, String type, ArrayList<Social_linksModel> social_links, CreatorModel creator, String privacy, String background_image, VersionModel version, String start_time, String email, String organizer_name, String end_time, Call_for_papersModel call_for_papers, String code_of_conduct, int id, String schedule_published_on, String logo, String location_name, String description) {

		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.state = state;
		this.name = name;
		this.topic = topic;
		this._copyright = copyright;
		this.type = type;
		this.social_links = social_links;
		this._creator = creator;
		this.privacy = privacy;
		this.background_image = background_image;
		this._version = version;
		this.start_time = start_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.location_name = location_name;
		this.description = description;

	}

}