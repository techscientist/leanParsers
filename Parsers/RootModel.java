import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String email;
	public String privacy;
	public String code_of_conduct;
	public String end_time;
	public String type;
	public String location_name;
	public String background_image;
	public String state;
	public int id;
	public VersionModel _version;
	public String schedule_published_on;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String description;
	public String timezone;
	public String start_time;
	public String topic;
	public String logo;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String email, String privacy, String code_of_conduct, String end_time, String type, String location_name, String background_image, String state, int id, VersionModel version, String schedule_published_on, String organizer_name, ArrayList<Social_linksModel> social_links, String organizer_description, Call_for_papersModel call_for_papers, String name, String description, String timezone, String start_time, String topic, String logo) {

		this._copyright = copyright;
		this._creator = creator;
		this.email = email;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.type = type;
		this.location_name = location_name;
		this.background_image = background_image;
		this.state = state;
		this.id = id;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.description = description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.topic = topic;
		this.logo = logo;

	}

}