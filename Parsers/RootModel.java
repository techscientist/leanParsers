import java.util.ArrayList;

class RootModel {

	public String timezone;
	public CreatorModel _creator;
	public String email;
	public String privacy;
	public String logo;
	public String start_time;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String background_image;
	public String name;
	public int id;
	public String location_name;
	public String organizer_description;
	public String state;
	public String code_of_conduct;
	public String organizer_name;
	public String type;
	public String description;

	public RootModel(String timezone, CreatorModel creator, String email, String privacy, String logo, String start_time, VersionModel version, ArrayList<Social_linksModel> social_links, String topic, CopyrightModel copyright, String schedule_published_on, Call_for_papersModel call_for_papers, String end_time, String background_image, String name, int id, String location_name, String organizer_description, String state, String code_of_conduct, String organizer_name, String type, String description) {

		this.timezone = timezone;
		this._creator = creator;
		this.email = email;
		this.privacy = privacy;
		this.logo = logo;
		this.start_time = start_time;
		this._version = version;
		this.social_links = social_links;
		this.topic = topic;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.background_image = background_image;
		this.name = name;
		this.id = id;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.type = type;
		this.description = description;

	}

}