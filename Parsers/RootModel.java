import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String logo;
	public String background_image;
	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public int id;
	public String privacy;
	public String code_of_conduct;
	public String schedule_published_on;
	public String state;
	public CopyrightModel _copyright;
	public String type;
	public String end_time;
	public String name;
	public VersionModel _version;
	public String topic;
	public CreatorModel _creator;
	public String description;

	public RootModel(String timezone, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String email, String logo, String background_image, String start_time, String organizer_description, String organizer_name, int id, String privacy, String code_of_conduct, String schedule_published_on, String state, CopyrightModel copyright, String type, String end_time, String name, VersionModel version, String topic, CreatorModel creator, String description) {

		this.timezone = timezone;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.email = email;
		this.logo = logo;
		this.background_image = background_image;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.id = id;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._copyright = copyright;
		this.type = type;
		this.end_time = end_time;
		this.name = name;
		this._version = version;
		this.topic = topic;
		this._creator = creator;
		this.description = description;

	}

}