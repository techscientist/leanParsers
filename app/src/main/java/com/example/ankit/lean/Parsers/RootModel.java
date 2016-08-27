import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String background_image;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String start_time;
	public int id;
	public String email;
	public String code_of_conduct;
	public String timezone;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_description;
	public VersionModel _version;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String state;
	public String topic;
	public String logo;
	public String description;
	public String name;
	public String type;

	public RootModel(CopyrightModel copyright, String background_image, String schedule_published_on, ArrayList<Social_linksModel> social_links, String location_name, String start_time, int id, String email, String code_of_conduct, String timezone, String end_time, CreatorModel creator, String organizer_description, VersionModel version, String privacy, Call_for_papersModel call_for_papers, String organizer_name, String state, String topic, String logo, String description, String name, String type) {

		this._copyright = copyright;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.location_name = location_name;
		this.start_time = start_time;
		this.id = id;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._version = version;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.state = state;
		this.topic = topic;
		this.logo = logo;
		this.description = description;
		this.name = name;
		this.type = type;

	}

}