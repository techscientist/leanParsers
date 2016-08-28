import java.util.ArrayList;

class RootModel {

	public String timezone;
	public CreatorModel _creator;
	public String type;
	public String background_image;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String name;
	public String state;
	public String start_time;
	public String topic;
	public String organizer_name;
	public String logo;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String privacy;
	public int id;
	public String schedule_published_on;
	public String end_time;
	public String organizer_description;
	public VersionModel _version;

	public RootModel(String timezone, CreatorModel creator, String type, String background_image, String location_name, ArrayList<Social_linksModel> social_links, String description, String name, String state, String start_time, String topic, String organizer_name, String logo, String code_of_conduct, CopyrightModel copyright, Call_for_papersModel call_for_papers, String email, String privacy, int id, String schedule_published_on, String end_time, String organizer_description, VersionModel version) {

		this.timezone = timezone;
		this._creator = creator;
		this.type = type;
		this.background_image = background_image;
		this.location_name = location_name;
		this.social_links = social_links;
		this.description = description;
		this.name = name;
		this.state = state;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.privacy = privacy;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._version = version;

	}

}